package it.csi.stacore.staon.business.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.exception.BusinessException;
import it.csi.stacore.staon.util.Tracer;
import it.csi.stacore.staon.util.XmlSerializer;
import it.csi.stacore.staon.util.aspect.CommonAspect;


@Component("serviceAspect")
@Aspect
public class ServiceAspect extends CommonAspect{

	public static final String LOGGER_PREFIX = Constants.APPLICATION_NAME + ".aspect";

	@Around(value = "execution(* it.csi.stacore.staon.business.service.impl..*.*(..))", argNames = "joinPoint")
	public Object stopWatchMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.stopWatchAspect(joinPoint);
	}

	@Before(value="execution(* it.csi.fpcommon.fpsend.business.helper.impl..*.*(..))")
	public void beforeAspect(JoinPoint joinPoint) throws Throwable {
		super.beforeAspect(joinPoint);
	}

	@AfterThrowing (pointcut="execution(* it.csi.stacore.staon.business.service.impl..*.*(..))", throwing="ex" )
	public void afterThrowingAspect(JoinPoint joinPoint, Exception ex) throws Throwable {
		String className = joinPoint.getTarget().getClass().getName();
		String method = joinPoint.getSignature().getName();
		Tracer.error(LOG, className, method, "*** SERVICE BUSINESS TRACER ***");
		Tracer.error(LOG, className, method, "Si e' verificato un errore: " + ex);
		Tracer.info(LOG, className, method, "trace params:");
		for(int i = 0; i<joinPoint.getArgs().length; i++ ) {
			Tracer.info(LOG, className, method, "arg[" + i + "]: " + XmlSerializer.objectToXml(joinPoint.getArgs()[i]));
		}
		throw new BusinessException("Si e' verificato un errore sul servizio " + className + ":  " + method, ex);
	}


}
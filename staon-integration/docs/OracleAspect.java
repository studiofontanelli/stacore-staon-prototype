package it.csi.stacore.staon.integration.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import it.csi.stacore.staon.util.aspect.CommonAspect;


@Component("oracleAspect")
@Aspect
public class OracleAspect extends CommonAspect {

	@Around(value = "execution(* it.csi.stacore.staon.integration.dao.oracle..*.*(..))", argNames = "joinPoint")
	public Object stopWatchMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.stopWatchAspect(joinPoint);
	}
}
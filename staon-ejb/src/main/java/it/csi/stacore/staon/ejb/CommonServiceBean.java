package it.csi.stacore.staon.ejb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.access.BeanFactoryReference;
import org.springframework.context.access.ContextBeanFactoryReference;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.util.Tracer;

public class CommonServiceBean implements SessionBean {


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_NAME);

	protected SessionContext sessionContext;

	protected static BeanFactoryReference beanFactoryReference;





	public void startSpringContext() throws Exception {
		String method = "startSpringContext";
		Tracer.debug(LOG,  getClass().getName(), method, "BEGIN");
		try{
			String[] springCfg = new String[]{"META-INF/staonApplicationContext.xml"};
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(springCfg);
			beanFactoryReference = new ContextBeanFactoryReference(ctx);
			Tracer.info(LOG,  getClass().getName(), method, "spring Context started correctly!");
		}
		catch(Exception e){
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw e;
		}
		finally{
			Tracer.debug(LOG,  getClass().getName(), method, "END");
		}

	}

	public void ejbCreate() throws CreateException {
		String method = "ejbCreate";
		Tracer.debug(LOG,  getClass().getName(), method, "BEGIN");
		try{

			startSpringContext();
		}
		catch (Exception e) {
			Tracer.error(LOG,  getClass().getName(), method, "Exception " + e);
			throw new CreateException(e.getMessage());

		}
		finally{
			Tracer.debug(LOG,  getClass().getName(), method, "END");
		}

	}

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		final String method = "ejbActivate";
		Tracer.debug(LOG, getClass().getName(), method, "called");


	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		final String method = "ejbPassivate";
		Tracer.debug(LOG, getClass().getName(), method, "called");

	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		final String method = "ejbRemove";
		Tracer.debug(LOG, getClass().getName(), method, "called");

	}

	@Override
	public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {
		final String method = "setSessionContext";
		Tracer.debug(LOG, getClass().getName(), method, "called");
		this.sessionContext = sessionContext;

	}

	public boolean testResources() throws Exception {
		final String method = "testResources";
		Tracer.debug(LOG, getClass().getName(), method, "BEGIN");
		try{
			return true;
		}
		finally{
			Tracer.debug(LOG,getClass().getName(), method, "END");
		}
	}

}

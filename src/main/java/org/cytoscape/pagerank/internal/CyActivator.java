/**
 * 
 */
package org.cytoscape.pagerank.internal;

import java.util.Properties;

import org.cytoscape.service.util.AbstractCyActivator;
import org.cytoscape.task.NetworkTaskFactory;
import org.cytoscape.work.ServiceProperties;
import org.osgi.framework.BundleContext;

/**
 * @author Jimmy
 *
 */
public class CyActivator extends AbstractCyActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		 Properties properties = new Properties();
         properties.put(ServiceProperties.PREFERRED_MENU, ServiceProperties.APPS_MENU);
         properties.put(ServiceProperties.TITLE, "GooglePagerank");
         registerService(context, new PagerankNetworkTaskFactory(), NetworkTaskFactory.class, properties);
		
	}

}

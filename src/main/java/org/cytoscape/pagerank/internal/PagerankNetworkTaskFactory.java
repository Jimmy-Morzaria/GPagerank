/**
 * 
 */
package org.cytoscape.pagerank.internal;

import org.cytoscape.model.CyNetwork;
import org.cytoscape.task.NetworkTaskFactory;
import org.cytoscape.work.TaskIterator;

/**
 * @author Jimmy
 * 
 */
public class PagerankNetworkTaskFactory implements NetworkTaskFactory {

	@Override
	public TaskIterator createTaskIterator(CyNetwork network) {
		// TODO Auto-generated method stub
		return new TaskIterator(new PagerankTask(network));
	}

	@Override
	public boolean isReady(CyNetwork network) {
		// TODO Auto-generated method stub
		return network != null;
	}

}

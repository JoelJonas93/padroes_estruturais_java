package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		// TV tv = new TV();
		// pc.connectPort(tv);

		// OldMonitor oldMonitor = new OldMonitor();
		// pc.connectPort(new HDMIToVGAAdapter(oldMonitor));
		// pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		// System.out.println("------ Monitor ----------");
		
		HDMIToOldMonitorAdapter oldMonitor = new HDMIToOldMonitorAdapter();
		pc.connectPort(oldMonitor);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ Monitor Class Adapter ----------");
		

	}
}

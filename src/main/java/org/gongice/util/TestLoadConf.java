package org.gongice.util;  

import java.io.IOException;
import org.gongice.util.config.ConfLoader;
import backtype.storm.Config;

public class TestLoadConf {
	public static void main(String[] args) throws IOException {
		Config conf = new ConfLoader()
				.loadStormConfig("E:\\Workstation\\Github\\yaml-config\\conf\\event-conf-production.yaml");
		ConfLoader.print(conf);
		
	}
}

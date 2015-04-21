package scjp;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class UpToSCJP7 {

	public void registerFileWather() throws IOException, InterruptedException {
		WatchService watchService = FileSystems.getDefault().newWatchService();
		Path dirToWatch = Paths.get("C:\\java libs");
		dirToWatch.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
		WatchKey key = null;
		while (true) {
			key = watchService.take();
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println(event.kind());
				System.out.println(event.context());
			}
			key.reset();
		}
	}
}

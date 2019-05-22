package main.composite;

import main.composite.leaf.File;
import main.composite.component.Component;
import main.composite.composite.Folder;

public class Launch {

	public static void main(String[] args) {
		Component folderProject = new Folder("project");
		Component folderSrc = new Folder("src");
		folderSrc.add(new Folder("main"));
		folderProject.add(new Folder(".settings"));
		folderProject.add(folderSrc);
		folderProject.add(new Folder("target"));
		folderProject.add(new File(".classPath"));
		folderProject.add(new File(".project"));
		folderProject.add(new File("pom.xml"));
		folderProject.display(0);
	}
}

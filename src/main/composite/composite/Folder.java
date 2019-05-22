package main.composite.composite;

import main.composite.component.Component;
import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
	private final String FOLDER_MARK = "> ";
	private List<Component> children;

	public Folder(String name) {
		super(name);
		children = new ArrayList<>();
	}

	@Override
	public void display(int deep) {
		System.out.println(calculateIndept(deep) + FOLDER_MARK + name);
		for (Component component : children) {
			component.display(deep + 1);
		}
	}

	@Override
	public void add(Component child) {
		children.add(child);
	}

	@Override
	public void remove(Component child) {
		children.remove(child);
	}

	@Override
	public Component getChild(int childId) {
		return children.get(childId);

	}
}

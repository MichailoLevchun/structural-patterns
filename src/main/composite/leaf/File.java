package main.composite.leaf;

import main.composite.component.Component;

public class File extends Component {

	public File(String name) {
		super(name);
	}

	@Override
	public void display(int deep) {
		System.out.println(calculateIndept(deep) + name);
	}

	@Override
	public void add(Component child) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Component child) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Component getChild(int childId) {
		throw new UnsupportedOperationException();

	}
}

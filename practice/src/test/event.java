package test;

import javax.swing.JOptionPane;

public class event {
	
	int day = 1;
	int food = 10;

	public void start() {
		
		action actions = new action();

		String choice = JOptionPane.showInputDialog(null, "What do you want to do?\nEat\nSleep\nWalk\nRun");
		
		
		if 		(choice.equalsIgnoreCase("eat")) {
			if (food == 0) {
				JOptionPane.showMessageDialog(null, "no food left!");
				days(day, food);
				start();
			}
			actions.eat();
			food--;
			day++;
			days(day, food);
			start();
		}else if(choice.equalsIgnoreCase("sleep")) {
			if (food == 0) {
				JOptionPane.showMessageDialog(null, "your pet was hungry.");
				actions.sleep();
				day++;
				days(day, food);
				start();
			}
			actions.sleep();
			day++;
			days(day, food);
			start();
		}else if(choice.equalsIgnoreCase("walk")) {
			if (food == 0) {
				JOptionPane.showMessageDialog(null, "your pet was hungry.");
				actions.walk();
				day++;
				days(day, food);
				start();
			}
			actions.walk();
			day++;
			days(day, food);
			start();
		}else if(choice.equalsIgnoreCase("run")) {
			if (food == 0) {
				JOptionPane.showMessageDialog(null, "your pet was hungry.");
				actions.run();
				day++;
				days(day, food);
				start();
			}
			actions.run();
			day++;
			days(day, food);
			start();
		}
		}
		
		public void days(int day, int food) {
			JOptionPane.showMessageDialog(null, "Day " + day + "\nFood remaining: " + food);
		}

}

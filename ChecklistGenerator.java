/**
 * @author Karthikeyan
 * pracice file
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChecklistGenerator {
	public static void main(String[] args) {
		new ChecklistGenerator();
	}

	public ChecklistGenerator() {
		JFrame guiFrame = new JFrame();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Example GUI");
		guiFrame.setSize(300, 250);
		// This will center the JFrame in the middle of the screen
		guiFrame.setLocationRelativeTo(null);
		// Options for the JComboBox
		String[] fruitOptions = { "Apple", "Apricot", "Banana", "Cherry",
				"Date", "Kiwi", "Orange", "Pear", "Strawberry" };
		// Options for the JList
		String[] vegOptions = { "Asparagus", "Beans", "Broccoli", "Cabbage",
				"Carrot", "Celery", "Cucumber", "Leek", "Mushroom", "Pepper",
				"Radish", "Shallot", "Spinach", "Swede", "Turnip" };

		final JPanel comboPanel = new JPanel();
		JLabel comboLbl = new JLabel("Fruits:");
		JComboBox fruits = new JComboBox(fruitOptions);
		comboPanel.add(comboLbl);
		comboPanel.add(fruits);

		final JPanel listPanel = new JPanel();
		listPanel.setVisible(false);
		
		JLabel listLbl = new JLabel("Vegetables:");
		JList vegs = new JList(vegOptions);
		vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		listPanel.add(listLbl);
		listPanel.add(vegs);
		
		JButton vegFruitBut = new JButton("Fruit or Veg");
		vegFruitBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				listPanel.setVisible(!listPanel.isVisible());
				comboPanel.setVisible(!comboPanel.isVisible());
			}
		});
		guiFrame.add(comboPanel, BorderLayout.NORTH);
		guiFrame.add(listPanel, BorderLayout.CENTER);
		guiFrame.add(vegFruitBut, BorderLayout.SOUTH);
		guiFrame.setVisible(true);
	}

}

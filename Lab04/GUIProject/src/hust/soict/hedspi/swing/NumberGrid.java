package hust.soict.hedspi.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers = new JButton[10];
    private JTextField tfDisplay;
    private JButton btnDelete,btnReset;
    
    public static void main(String[] args) {
    	new NumberGrid();
    }
    
    public NumberGrid() {
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tfDisplay.setSize(200, 100);
        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 200);
        setVisible(true);
    }
    // add button
    void addButtons(JPanel panelButtons) {
        ButtonListener btnListener = new ButtonListener();
        for(int i = 1; i <= 9; i++) {
            btnNumbers[i] = new JButton("" + i);
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(btnListener);
        }

        btnDelete = new JButton("DEL");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(btnListener);

        btnNumbers[0] = new JButton("0");
        panelButtons.add(btnNumbers[0]);
        btnNumbers[0].addActionListener(btnListener);

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(btnListener);
    }
    
    // button listener
    private class ButtonListener implements ActionListener{
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		String button = e.getActionCommand();
    		if(button.charAt(0) >= '0' && button.charAt(0) <= '9') {
    			tfDisplay.setText(tfDisplay.getText() + button);
    		}
    		else if (button.equals("DEL")) {
    			StringBuilder sb = new StringBuilder(tfDisplay.getText());
    			if (sb.length()!=0) {
    			    sb.deleteCharAt(sb.length() - 1);
    			    tfDisplay.setText(sb.toString());
    			}
    		}
    		else {
    			tfDisplay.setText("");
    		}
    	}
    }
}

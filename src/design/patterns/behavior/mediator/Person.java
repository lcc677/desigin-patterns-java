package design.patterns.behavior.mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Person {
	private String name;
	private Mediator mediator;
	
	private JTextArea receiveArea;
	private JTextField sendField;

	public Person(String name) {
		this.name = name;
		JFrame frame = new JFrame(name);
		
		JPanel receivePanel = new JPanel();
		receivePanel.setBorder(BorderFactory.createTitledBorder("接收内容："));
		receiveArea = new JTextArea(15,26);
		receiveArea.setEditable(false);
		receivePanel.add(receiveArea);
		
		sendField = new JTextField(26);
		sendField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String message = sendField.getText().trim();
				sendField.setText("");
				Send(message);
				
			}
		});
		receivePanel.add(sendField);
		frame.add(receivePanel);
		frame.setSize(300,350);
		frame.setVisible(true);
		
		
		
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Mediator getMediator() {
		return mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public JTextArea getReceiveArea() {
		return receiveArea;
	}

	public void setReceiveArea(JTextArea receiveArea) {
		this.receiveArea = receiveArea;
	}

	abstract public void Send(String message);
	abstract public void receive(String message);
	
}

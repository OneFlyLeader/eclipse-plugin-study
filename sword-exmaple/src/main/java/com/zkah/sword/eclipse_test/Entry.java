package com.zkah.sword.eclipse_test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public final class Entry {
	private static Text text;
	private static Button swtButton;
	private static Button swingButton;
	private static Button awtButton;
	private static Group group;
	private static Button button;
	private static Label benefitOfSwtLabel;
	private static List list;

	public static void main(String[] args) {
		Display display = Display.getDefault();
		
		// 创建窗口对象
		final Shell shell = new Shell(display);
		shell.setText("Hello SWT");
		shell.setSize(260, 283);
		// 打开窗口
		shell.open();
		
		text = new Text(shell, 0);
		text.setText("Eclipse SWT");
		text.setBounds(10, 8, 230, 35);
		
		list = new List(shell, SWT.BORDER);
		list.setItems("Hello, my master.");
		list.setBounds(10, 68, 232, 82);
		
		benefitOfSwtLabel = new Label(shell, SWT.NONE);
		benefitOfSwtLabel.setText("SWT的优势");
		benefitOfSwtLabel.setBounds(10, 159, 230, 47);
		
		group = new Group(shell, SWT.NONE);
		group.setText("你使用过哪些软件");
		group.setBounds(10, 159, 230, 47);
		
		awtButton = new Button(group, SWT.CHECK);
		awtButton.setText("AWT");
		awtButton.setBounds(10, 20, 54, 18);
		
		swingButton = new Button(group, SWT.CHECK);
		swingButton.setText("Swing");
		swingButton.setBounds(70, 22, 60, 15);
		
		swtButton = new Button(group, SWT.CHECK);
		swtButton.setText("SWT");
		swtButton.setBounds(136, 22, 62, 15);
		
		button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageBox msgBox = new MessageBox(shell, SWT.ICON_INFORMATION);
				msgBox.setMessage("Hello SWT");
				msgBox.open();
			}
		});
		button.setText("Say hello to SWT");
		button.setBounds(10, 214, 227, 25);
		
		// 布局组件
		shell.layout();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}

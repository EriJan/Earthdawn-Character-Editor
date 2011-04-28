package de.earthdawn.ui2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.AbstractTableModel;

import de.earthdawn.CharacterContainer;
import de.earthdawn.data.ACCOUNTINGType;
import de.earthdawn.data.DEVOTIONType;
import de.earthdawn.data.EDCHARACTER;
import de.earthdawn.data.PlusminusType;

public class EDDevotionPoints extends JPanel {

	/**
	 * Create the panel.
	 */
	private CharacterContainer character;
	private JToolBar toolBar;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnAddDevotionPointsEntry;
	private JButton btnRemoveDevotionPointsEntry;
	private JTextField textFieldPassion;

	public CharacterContainer getCharacter() {
		return character;
	}

	public void setCharacter(CharacterContainer character) {
		
		this.character = character;
		((DevotionPointsTableModel)table.getModel()).setCharacter(character);
		JComboBox comboBoxPlusMinus = new JComboBox();
		comboBoxPlusMinus.addItem("+");
		comboBoxPlusMinus.addItem("-");
		table.getColumnModel().getColumn(2).setCellEditor(new javax.swing.DefaultCellEditor(comboBoxPlusMinus));		
	}

	public EDDevotionPoints() {

		setLayout(new BorderLayout(0,0));

		toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		btnAddDevotionPointsEntry = new JButton("Add DevotionPoints");
		btnAddDevotionPointsEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnAddDevotionPointsEntry_actionPerformed(arg0);
			}
		});
		toolBar.add(btnAddDevotionPointsEntry);

		btnRemoveDevotionPointsEntry = new JButton("Remove DevotionPoints");
		btnRemoveDevotionPointsEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnRemoveDevotionPointsEntry_actionPerformed(arg0);
			}
		});
		toolBar.add(btnRemoveDevotionPointsEntry);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		InputMapUtil.setupInputMap(table);	
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DevotionPointsTableModel(character));
		scrollPane.setViewportView(table);
		table.setRowSelectionAllowed(false);
		
		JComboBox comboBoxPlusMinus = new JComboBox();
		comboBoxPlusMinus.addItem("+");
		comboBoxPlusMinus.addItem("-");
		table.getColumnModel().getColumn(2).setCellEditor(new javax.swing.DefaultCellEditor(comboBoxPlusMinus));
		JPanel southPanel= new JPanel();
		add(southPanel,BorderLayout.SOUTH);
		southPanel.add(new JLabel("Passion:"));
		textFieldPassion = new JTextField();
		textFieldPassion.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				do_textFieldPassion_caretUpdate(arg0);
			}
		});
		textFieldPassion.setColumns(20);
		southPanel.add(textFieldPassion);
	}

	protected void do_textFieldPassion_caretUpdate(CaretEvent arg0) {
		if( character == null) return;
		EDCHARACTER edcharacter = character.getEDCHARACTER();
		if( edcharacter == null) return;
		DEVOTIONType devotion = edcharacter.getDEVOTION();
		if( devotion == null) {
			devotion = new DEVOTIONType();
			devotion.setValue(0);
			edcharacter.setDEVOTION(devotion);
		}
		devotion.setPassion(textFieldPassion.getText());
		character.refesh();
	}

	protected void do_btnAddDevotionPointsEntry_actionPerformed(ActionEvent arg0) {
		SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
		ACCOUNTINGType ac = new ACCOUNTINGType();
		ac.setType(PlusminusType.PLUS);
		ac.setWhen(format.format(new Date()));
		ac.setComment(new String(""));
		ac.setValue(0);

		DEVOTIONType devotion = character.getEDCHARACTER().getDEVOTION();
		if( devotion == null) {
			devotion = new DEVOTIONType();
			devotion.setValue(0);
			devotion.setPassion("--");
			character.getEDCHARACTER().setDEVOTION(devotion);
		}
		List<ACCOUNTINGType> devotionpoints = devotion.getDEVOTIONPOINTS();
		devotionpoints.add(ac);
		character.refesh();
	}

	protected void do_btnRemoveDevotionPointsEntry_actionPerformed(ActionEvent arg0) {
		ArrayList<ACCOUNTINGType> expForRemoval = new ArrayList<ACCOUNTINGType> ();
		List<ACCOUNTINGType> devotionpointsList = character.getEDCHARACTER().getDEVOTION().getDEVOTIONPOINTS();
		for(int row :table.getSelectedRows()){
			ACCOUNTINGType devotionPoints =devotionpointsList.get(row);
			expForRemoval.add(devotionPoints);
		}
		devotionpointsList.removeAll(expForRemoval);	
		character.refesh();
	}
}

class DevotionPointsTableModel extends AbstractTableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CharacterContainer character;
	private String[] columnNames = {"Date", "Comment",  "Type", "Value"};

	public DevotionPointsTableModel(CharacterContainer character) {
		super();
		this.character = character;
	}	
  
	public void setCharacter(CharacterContainer character) {
		this.character = character;
		fireTableStructureChanged();
	}

	public CharacterContainer getCharacter() {
		return character;
	}	

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		if( character == null) return 0;
		EDCHARACTER edcharacter = character.getEDCHARACTER();
		if( edcharacter == null) return 0;
		DEVOTIONType devotion = edcharacter.getDEVOTION();
		if( devotion == null) return 0;
		List<ACCOUNTINGType> devotionpoints = devotion.getDEVOTIONPOINTS();
		if( devotionpoints == null) return 0;
		return devotionpoints.size();
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		// {"Date", "Comment",  "Type", "Value"}
		if(character != null){ 
			ACCOUNTINGType accounting = character.getEDCHARACTER().getDEVOTION().getDEVOTIONPOINTS().get(row);
			switch (col) {
				case 0: return accounting.getWhen();
				case 1: return accounting.getComment();
				case 2: if (accounting.getType().equals(PlusminusType.PLUS)) {
							return new String("+");
						} else{
							return new String("-");
						}
				
				case 3: return new Integer(accounting.getValue());
				default : return new String("Error not defined");
			}
		} else {
			return 0;
		}
	}

	/*
	 * JTable uses this method to determine the default renderer/
	 * editor for each cell.  If we didn't implement this method,
	 * then the last column would contain text ("true"/"false"),
	 * rather than a check box.
	 */
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

	/*
	 * Don't need to implement this method unless your table's
	 * editable.
	 */
	public boolean isCellEditable(int row, int col) {
		return true;
	}

	/*
	 * Don't need to implement this method unless your table's
	 * data can change.
	 */
	
	
	public void setValueAt(Object value, int row, int col) { 
		ACCOUNTINGType accounting = character.getEDCHARACTER().getDEVOTION().getDEVOTIONPOINTS().get(row);
		// {"Date", "Comment",  "Type", "Value"}
		switch (col) {			
			case 0: accounting.setWhen((String)value); break;
			case 1: accounting.setComment((String)value);  break;
			case 2: if (((String)value).equals("+")) {
						System.out.println("+");
						accounting.setType(PlusminusType.PLUS);
					} else{
						System.out.println("-");
						accounting.setType(PlusminusType.MINUS);
					}
					break;
			case 3: accounting.setValue(((Integer)value).intValue());  break;
		}
		character.refesh();	
	}
}
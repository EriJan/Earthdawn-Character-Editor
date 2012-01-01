package de.earthdawn.ui2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import de.earthdawn.CharacterContainer;
import de.earthdawn.config.ApplicationProperties;
import de.earthdawn.data.CHARACTERLANGUAGEType;
import de.earthdawn.data.LAYOUTSIZESType;
import de.earthdawn.data.YesnoType;

public class EDLanguages extends JPanel {
	private static final long serialVersionUID = -3029891477607441807L;
	public static final ApplicationProperties PROPERTIES=ApplicationProperties.create();
	private CharacterContainer character;
	private JTable tableLanguages;
	private JTable tableLanguageSkills;
	private JButton btnAddLanguage;
	private JButton btnRemoveLanguages;
	private BufferedImage backgroundimage = null;

	public CharacterContainer getCharacter() {
		return character;
	}

	public void setCharacter(CharacterContainer character) {
		this.character = character;
		((LanguagesTableModel)tableLanguages.getModel()).setCharacter(character);
		try {
			int c=0;
			for( LAYOUTSIZESType width : PROPERTIES.getGuiLayoutTabel("languageselection") ) {
				TableColumn col = tableLanguages.getColumnModel().getColumn(c);
				if( width.getMin() != null ) col.setMinWidth(width.getMin());
				if( width.getMax() != null ) col.setMaxWidth(width.getMax());
				if( width.getPreferred() != null ) col.setPreferredWidth(width.getPreferred());
				c++;
			}
		} catch(IndexOutOfBoundsException e) {
			System.err.println("layout languageselection : "+e.getLocalizedMessage());
		}
		((SkillsTableModel)tableLanguageSkills.getModel()).setCharacter(character);
		try {
			int c=0;
			for( LAYOUTSIZESType width : PROPERTIES.getGuiLayoutTabel("skillselection") ) {
				TableColumn col = tableLanguageSkills.getColumnModel().getColumn(c);
				if( width.getMin() != null ) col.setMinWidth(width.getMin());
				if( width.getMax() != null ) col.setMaxWidth(width.getMax());
				if( width.getPreferred() != null ) col.setPreferredWidth(width.getPreferred());
				c++;
			}
		} catch(IndexOutOfBoundsException e) {
			System.err.println("layout skillselection : "+e.getLocalizedMessage());
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		if( backgroundimage == null ) {
			File file = new File("templates/languages_background.jpg");
			try {
				backgroundimage = ImageIO.read(file);
			} catch (IOException e) {
				System.err.println("can not read background image : "+file.getAbsolutePath());
			}
		}
		if( backgroundimage != null ) g.drawImage(backgroundimage, 0, 0, getWidth(), getHeight(), this);
		super.paintComponent(g);
	}

	public EDLanguages() {
		setOpaque(false);
		setLayout(new BorderLayout(0,0));

		JToolBar toolBar = new JToolBar();
		toolBar.setOpaque(false);

		btnAddLanguage = new JButton("Add Language");
		btnAddLanguage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnAddLanguage_actionPerformed(arg0);
			}
		});
		toolBar.add(btnAddLanguage);

		btnRemoveLanguages = new JButton("Remove Languages");
		btnRemoveLanguages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnRemoveLanguages_actionPerformed(arg0);
			}
		});
		toolBar.add(btnRemoveLanguages);

		tableLanguages = new JTable(){
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) 
			{
				Component component = super.prepareRenderer( renderer, row, column);
				if( component instanceof JComponent )
					((JComponent)component).setOpaque(false);
				return component;
			}
		};
		tableLanguages.setOpaque(false);
		tableLanguages.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableLanguages.setModel(new LanguagesTableModel(character));
		tableLanguages.setRowSelectionAllowed(false);
		tableLanguages.setColumnSelectionAllowed(false);
		tableLanguages.getTableHeader().setReorderingAllowed(false);
		InputMapUtil.setupInputMap(tableLanguages);

		tableLanguageSkills = new JTable(){
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) 
			{
				Component component = super.prepareRenderer(renderer, row, column);
				if( component instanceof JComponent )
					((JComponent)component).setOpaque(false);
				return component;
			}
		};
		tableLanguageSkills.setOpaque(false);
		tableLanguageSkills.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableLanguageSkills.setModel(new SkillsTableModel(character,true));
		tableLanguageSkills.getColumnModel().getColumn(3).setCellEditor(new SpinnerEditor(0, 10));
		tableLanguageSkills.getColumnModel().getColumn(4).setCellEditor(new SpinnerEditor(0, 10));
		tableLanguageSkills.setRowSelectionAllowed(false);
		tableLanguageSkills.setColumnSelectionAllowed(false);
		tableLanguageSkills.getTableHeader().setReorderingAllowed(false);

		JScrollPane scrollPaneLanguages = new JScrollPane();
		scrollPaneLanguages.setOpaque(false);
		scrollPaneLanguages.setViewportView(tableLanguages);
		scrollPaneLanguages.getViewport().setOpaque(false);

		JScrollPane southPanel = new JScrollPane();
		southPanel.setOpaque(false);
		southPanel.setViewportView(tableLanguageSkills);
		southPanel.getViewport().setOpaque(false);

		add(toolBar, BorderLayout.NORTH);
		add(scrollPaneLanguages, BorderLayout.CENTER);
		//add(southPanel, BorderLayout.SOUTH);
	}

	protected void do_btnAddLanguage_actionPerformed(ActionEvent arg0) {
		if( character == null ) return;
		CHARACTERLANGUAGEType l = new CHARACTERLANGUAGEType();
		l.setSpeak(YesnoType.NO);
		l.setReadwrite(YesnoType.NO);
		l.setNotlearnedbyskill(YesnoType.NO);
		l.setLanguage("to be specified");
		character.getLanguages().add(l);
		character.refesh();
	}

	protected void do_btnRemoveLanguages_actionPerformed(ActionEvent arg0) {
		if( character == null ) return;
		ArrayList<CHARACTERLANGUAGEType> expForRemoval = new ArrayList<CHARACTERLANGUAGEType> ();
		List<CHARACTERLANGUAGEType> languages = character.getLanguages();
		for(int row :tableLanguages.getSelectedRows()){
			CHARACTERLANGUAGEType language = languages.get(row);
			expForRemoval.add(language);
		}
		languages.removeAll(expForRemoval);	
		character.refesh();
	}
}

class LanguagesTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -2330554075615304424L;
	private CharacterContainer character;
	private String[] columnNames = {"Language", "Speak",  "Read/Write", "Not Learned By Skill"};

	public LanguagesTableModel(CharacterContainer character) {
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
		return character.getLanguages().size();
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		if( character == null ) return 0;
		if( row < character.getLanguages().size() ) {
			CHARACTERLANGUAGEType language = character.getLanguages().get(row);
			switch (col) {
			case 0: return language.getLanguage();
			case 1: return language.getSpeak().equals(YesnoType.YES);
			case 2: return language.getReadwrite().equals(YesnoType.YES);
			case 3: return language.getNotlearnedbyskill().equals(YesnoType.YES);
			default : return "Error not defined";
			}
		} else {
			int i=0;
			switch (col) {
			case 1:
				for( CHARACTERLANGUAGEType lang : character.getLanguages() ) {
					if( lang.getSpeak().equals(YesnoType.YES) ) i++;
				}
				break;
			case 2:
				for( CHARACTERLANGUAGEType lang : character.getLanguages() ) {
					if( lang.getReadwrite().equals(YesnoType.YES) ) i++;
				}
				break;
			case 3:
				for( CHARACTERLANGUAGEType lang : character.getLanguages() ) {
					if( lang.getNotlearnedbyskill().equals(YesnoType.YES) ) i++;
				}
				break;
			default : return "";
			}
			return i;
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

	public boolean isCellEditable(int row, int col) {
		if( row < character.getLanguages().size() ) return true;
		return false;
	}

	public void setValueAt(Object value, int row, int col) { 
		if( character == null ) return;
		CHARACTERLANGUAGEType language = character.getLanguages().get(row);
		switch (col) {
		case 0:
			language.setLanguage((String)value);
			break;
		case 1:
			if( (Boolean)value ) language.setSpeak(YesnoType.YES);
			else language.setSpeak(YesnoType.NO);
			break;
		case 2:
			if( (Boolean)value ) language.setReadwrite(YesnoType.YES);
			else language.setReadwrite(YesnoType.NO);
			break;
		case 3:
			if( (Boolean)value ) language.setNotlearnedbyskill(YesnoType.YES);
			else language.setNotlearnedbyskill(YesnoType.NO);
			break;
		}
		character.refesh();
	}
}
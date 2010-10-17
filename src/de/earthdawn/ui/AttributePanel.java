package de.earthdawn.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;

import de.earthdawn.data.ATTRIBUTNameType;
import de.earthdawn.data.ATTRIBUTType;
import de.earthdawn.data.EDCHARAKTER;

/**
 * Panel zur Anzeige der Attribute des Charakters.
 * 
 * @author mh
 */
public class AttributePanel extends JPanel {
	
	/** Map zur Verwaltung der Attribute. */
	private Map<String, UIAttribut> attribute = new HashMap<String, UIAttribut>();

	/**
	 * Default-Konstruktor.
	 */
	public AttributePanel() {
		initComponents();
	}
	
	private void initComponents() {	
		setLayout(new GridBagLayout());
		GridBagConstraintsBuilder gbcb = new GridBagConstraintsBuilder();

		// --- Geschicklichkeit
		createAttribut(gbcb, new UIAttribut(ATTRIBUTNameType.GESCHICKLICHKEIT.value()));
		createAttribut(gbcb, new UIAttribut(ATTRIBUTNameType.STAERKE.value()));
		createAttribut(gbcb, new UIAttribut(ATTRIBUTNameType.CHARISMA.value()));
		createAttribut(gbcb, new UIAttribut(ATTRIBUTNameType.WAHRNEHMUNG.value()));
		createAttribut(gbcb, new UIAttribut(ATTRIBUTNameType.ZAEHIGKEIT.value()));
		createAttribut(gbcb, new UIAttribut(ATTRIBUTNameType.WILLENSKRAFT.value()));
	}

	private void createAttribut(GridBagConstraintsBuilder gbcb, UIAttribut attribut) {
		add(new JLabel(attribut.getName()), gbcb.nextCell(1, 0));
		add(attribut.getSpinWert(), gbcb.nextCell(1, 0));
		add(new JLabel("+"), gbcb.nextCell(1, 0));
		add(attribut.getSpinSteig(), gbcb.nextCell(1, 0));
		add(new JLabel("+"), gbcb.nextCell(1, 0));
		add(attribut.getLbExt1(), gbcb.nextCell(1, 0));

		// TODO: Linksb�ndig ... 
		GridBagConstraints cell = gbcb.nextCell(1, 10);		
		add(attribut.getLbExt2(), cell);

		gbcb.nextLine();

		this.attribute.put(attribut.getName(), attribut);
	}

	public void attributAnzeigen(ATTRIBUTType attribut) {
		UIAttribut uiAttribut = this.attribute.get(attribut.getName().value());
		if (uiAttribut != null) {
			uiAttribut.getSpinWert().setValue(new Integer(attribut.getWert().intValue()));
			uiAttribut.getSpinSteig().setValue(new Integer(attribut.getSteig().intValue()));
		}
		else {
			// TODO: Unbekanntes Attribut? -> H�chstwahrscheinlich ein Konfigurationsproblem
		}
	}

	public void addToCharakter(EDCHARAKTER charakter) {
		for (UIAttribut uiAttribut : this.attribute.values()) {
			uiAttribut.addToCharakter(charakter);
		}
	}
}

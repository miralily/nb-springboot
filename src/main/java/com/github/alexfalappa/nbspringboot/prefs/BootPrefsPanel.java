/*
 * Copyright 2016 Alessandro Falappa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.alexfalappa.nbspringboot.prefs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.prefs.Preferences;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.openide.util.NbPreferences;

import com.github.alexfalappa.nbspringboot.PrefConstants;
import com.github.alexfalappa.nbspringboot.projects.initializr.InitializrService;

/**
 * Plugin options panel.
 * <p>
 * It is shown under the Java category in Tools/Options dialog.
 *
 * @author Alessandro Falappa
 */
final class BootPrefsPanel extends javax.swing.JPanel implements DocumentListener, ChangeListener, ActionListener {

    private final BootPrefsOptionsPanelController controller;
    private static final String[] SEVERITY_LEVELS = new String[]{"None", "Warning", "Error"};

    BootPrefsPanel(BootPrefsOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    /** This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this
     * method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lInitializr = new javax.swing.JLabel();
        sep1 = new javax.swing.JSeparator();
        lInitializrUrl = new javax.swing.JLabel();
        txInitializrUrl = new javax.swing.JTextField();
        lInitializrTimeout = new javax.swing.JLabel();
        spInitializrTimeout = new javax.swing.JSpinner();
        lSeconds = new javax.swing.JLabel();
        lLaunch = new javax.swing.JLabel();
        sep2 = new javax.swing.JSeparator();
        chDevtoolsTrigger = new javax.swing.JCheckBox();
        chColorOutput = new javax.swing.JCheckBox();
        lVmOpts = new javax.swing.JLabel();
        txVmOpts = new javax.swing.JTextField();
        chVmOptsLaunch = new javax.swing.JCheckBox();
        lCfgProps = new javax.swing.JLabel();
        sep3 = new javax.swing.JSeparator();
        lLists = new javax.swing.JLabel();
        chDeprSortLast = new javax.swing.JCheckBox();
        chDeprErrorShow = new javax.swing.JCheckBox();
        lErrHighl = new javax.swing.JLabel();
        lSynErr = new javax.swing.JLabel();
        cbSynErr = new javax.swing.JComboBox<>();
        lDupl = new javax.swing.JLabel();
        cbDupl = new javax.swing.JComboBox<>();
        lDtMismatch = new javax.swing.JLabel();
        cbDtMismatch = new javax.swing.JComboBox<>();
        lUnknown = new javax.swing.JLabel();
        cbUnknown = new javax.swing.JComboBox<>();

        org.openide.awt.Mnemonics.setLocalizedText(lInitializr, org.openide.util.NbBundle.getMessage(BootPrefsPanel.class, "BootPrefsPanel.lInitializr.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lInitializrUrl, org.openide.util.NbBundle.getMessage(BootPrefsPanel.class, "BootPrefsPanel.lInitializrUrl.text")); // NOI18N

        txInitializrUrl.setColumns(20);

        org.openide.awt.Mnemonics.setLocalizedText(lInitializrTimeout, org.openide.util.NbBundle.getMessage(BootPrefsPanel.class, "BootPrefsPanel.lInitializrTimeout.text")); // NOI18N

        spInitializrTimeout.setModel(new javax.swing.SpinnerNumberModel(30, 5, 999, 5));

        org.openide.awt.Mnemonics.setLocalizedText(lSeconds, org.openide.util.NbBundle.getMessage(BootPrefsPanel.class, "BootPrefsPanel.lSeconds.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lLaunch, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.lLaunch.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chDevtoolsTrigger, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.chDevtoolsTrigger.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chColorOutput, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.chColorOutput.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lVmOpts, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.lVmOpts.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chVmOptsLaunch, org.openide.util.NbBundle.getMessage(BootPrefsPanel.class, "BootPrefsPanel.chVmOptsLaunch.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lCfgProps, org.openide.util.NbBundle.getMessage(BootPrefsPanel.class, "BootPrefsPanel.lCfgProps.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lLists, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.lLists.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chDeprSortLast, org.openide.util.NbBundle.getMessage(BootPrefsPanel.class, "BootPrefsPanel.chDeprSortLast.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(chDeprErrorShow, org.openide.util.NbBundle.getMessage(BootPrefsPanel.class, "BootPrefsPanel.chDeprErrorShow.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lErrHighl, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.lErrHighl.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lSynErr, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.lSynErr.text")); // NOI18N

        cbSynErr.setModel(new DefaultComboBoxModel<>(SEVERITY_LEVELS));

        org.openide.awt.Mnemonics.setLocalizedText(lDupl, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.lDupl.text")); // NOI18N

        cbDupl.setModel(new DefaultComboBoxModel<>(SEVERITY_LEVELS));

        org.openide.awt.Mnemonics.setLocalizedText(lDtMismatch, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.lDtMismatch.text")); // NOI18N

        cbDtMismatch.setModel(new DefaultComboBoxModel<>(SEVERITY_LEVELS));

        org.openide.awt.Mnemonics.setLocalizedText(lUnknown, org.openide.util.NbBundle.getBundle(BootPrefsPanel.class).getString("BootPrefsPanel.lUnknown.text")); // NOI18N

        cbUnknown.setModel(new DefaultComboBoxModel<>(SEVERITY_LEVELS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lLaunch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lInitializr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lCfgProps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lInitializrTimeout)
                                    .addComponent(lInitializrUrl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spInitializrTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lSeconds)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txInitializrUrl)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lVmOpts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chVmOptsLaunch)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txVmOpts)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chColorOutput)
                                    .addComponent(chDevtoolsTrigger))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lLists)
                                    .addComponent(chDeprSortLast)
                                    .addComponent(chDeprErrorShow))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lErrHighl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lSynErr)
                                            .addComponent(lDupl)
                                            .addComponent(lDtMismatch)
                                            .addComponent(lUnknown))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbSynErr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbDupl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbDtMismatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lInitializr)
                    .addComponent(sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInitializrUrl)
                    .addComponent(txInitializrUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInitializrTimeout)
                    .addComponent(spInitializrTimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSeconds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lLaunch)
                    .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chDevtoolsTrigger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chColorOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lVmOpts)
                    .addComponent(txVmOpts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chVmOptsLaunch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lCfgProps)
                    .addComponent(sep3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lErrHighl)
                    .addComponent(lLists))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lSynErr)
                            .addComponent(cbSynErr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lDupl)
                            .addComponent(cbDupl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chDeprSortLast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chDeprErrorShow)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDtMismatch)
                    .addComponent(cbDtMismatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUnknown)
                    .addComponent(cbUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void load() {
        // read settings and initialize GUI
        final Preferences prefs = NbPreferences.forModule(PrefConstants.class);
        txInitializrUrl.setText(prefs.get(PrefConstants.PREF_INITIALIZR_URL, "http://start.spring.io"));
        txVmOpts.setText(prefs.get(PrefConstants.PREF_VM_OPTS, ""));
        spInitializrTimeout.setValue(prefs.getInt(PrefConstants.PREF_INITIALIZR_TIMEOUT, 30));
        chColorOutput.setSelected(prefs.getBoolean(PrefConstants.PREF_FORCE_COLOR_OUTPUT, true));
        chDevtoolsTrigger.setSelected(prefs.getBoolean(PrefConstants.PREF_MANUAL_RESTART, false));
        chVmOptsLaunch.setSelected(prefs.getBoolean(PrefConstants.PREF_VM_OPTS_LAUNCH, true));
        chDeprSortLast.setSelected(prefs.getBoolean(PrefConstants.PREF_DEPR_SORT_LAST, true));
        chDeprErrorShow.setSelected(prefs.getBoolean(PrefConstants.PREF_DEPR_ERROR_SHOW, false));
        cbDtMismatch.setSelectedIndex(prefs.getInt(PrefConstants.PREF_HLIGHT_LEV_DTMISMATCH, 2));
        cbDupl.setSelectedIndex(prefs.getInt(PrefConstants.PREF_HLIGHT_LEV_DUPLICATES, 1));
        cbSynErr.setSelectedIndex(prefs.getInt(PrefConstants.PREF_HLIGHT_LEV_SYNERR, 2));
        cbUnknown.setSelectedIndex(prefs.getInt(PrefConstants.PREF_HLIGHT_LEV_UNKNOWN, 1));
        // listen to changes in form fields and call controller.changed()
        // Register listener on the textFields to detect changes
        txInitializrUrl.getDocument().addDocumentListener(this);
        txVmOpts.getDocument().addDocumentListener(this);
        spInitializrTimeout.addChangeListener(this);
        chColorOutput.addActionListener(this);
        chDevtoolsTrigger.addActionListener(this);
        chVmOptsLaunch.addActionListener(this);
        chDeprSortLast.addActionListener(this);
        chDeprErrorShow.addActionListener(this);
        cbDtMismatch.addActionListener(this);
        cbDupl.addActionListener(this);
        cbSynErr.addActionListener(this);
        cbUnknown.addActionListener(this);
    }

    void store() {
        // store modified settings
        final Preferences prefs = NbPreferences.forModule(PrefConstants.class);
        prefs.put(PrefConstants.PREF_INITIALIZR_URL, txInitializrUrl.getText());
        prefs.put(PrefConstants.PREF_VM_OPTS, txVmOpts.getText());
        prefs.putInt(PrefConstants.PREF_INITIALIZR_TIMEOUT, (int) spInitializrTimeout.getValue());
        prefs.putBoolean(PrefConstants.PREF_FORCE_COLOR_OUTPUT, chColorOutput.isSelected());
        prefs.putBoolean(PrefConstants.PREF_MANUAL_RESTART, chDevtoolsTrigger.isSelected());
        prefs.putBoolean(PrefConstants.PREF_VM_OPTS_LAUNCH, chVmOptsLaunch.isSelected());
        prefs.putBoolean(PrefConstants.PREF_DEPR_SORT_LAST, chDeprSortLast.isSelected());
        prefs.putBoolean(PrefConstants.PREF_DEPR_ERROR_SHOW, chDeprErrorShow.isSelected());
        prefs.putInt(PrefConstants.PREF_HLIGHT_LEV_DTMISMATCH, cbDtMismatch.getSelectedIndex());
        prefs.putInt(PrefConstants.PREF_HLIGHT_LEV_DUPLICATES, cbDupl.getSelectedIndex());
        prefs.putInt(PrefConstants.PREF_HLIGHT_LEV_SYNERR, cbSynErr.getSelectedIndex());
        prefs.putInt(PrefConstants.PREF_HLIGHT_LEV_UNKNOWN, cbUnknown.getSelectedIndex());
        InitializrService.getInstance().clearCachedValues();
    }

    boolean valid() {
        // check whether form is consistent and complete
        boolean ret = true;
        try {
            URL url = new URL(txInitializrUrl.getText());
        } catch (MalformedURLException ex) {
            ret = false;
        }
        return ret;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDtMismatch;
    private javax.swing.JComboBox<String> cbDupl;
    private javax.swing.JComboBox<String> cbSynErr;
    private javax.swing.JComboBox<String> cbUnknown;
    private javax.swing.JCheckBox chColorOutput;
    private javax.swing.JCheckBox chDeprErrorShow;
    private javax.swing.JCheckBox chDeprSortLast;
    private javax.swing.JCheckBox chDevtoolsTrigger;
    private javax.swing.JCheckBox chVmOptsLaunch;
    private javax.swing.JLabel lCfgProps;
    private javax.swing.JLabel lDtMismatch;
    private javax.swing.JLabel lDupl;
    private javax.swing.JLabel lErrHighl;
    private javax.swing.JLabel lInitializr;
    private javax.swing.JLabel lInitializrTimeout;
    private javax.swing.JLabel lInitializrUrl;
    private javax.swing.JLabel lLaunch;
    private javax.swing.JLabel lLists;
    private javax.swing.JLabel lSeconds;
    private javax.swing.JLabel lSynErr;
    private javax.swing.JLabel lUnknown;
    private javax.swing.JLabel lVmOpts;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSeparator sep3;
    private javax.swing.JSpinner spInitializrTimeout;
    private javax.swing.JTextField txInitializrUrl;
    private javax.swing.JTextField txVmOpts;
    // End of variables declaration//GEN-END:variables

    // DocumentListener interface
    @Override
    public void insertUpdate(DocumentEvent e) {
        controller.changed();
    }

    // DocumentListener interface
    @Override
    public void removeUpdate(DocumentEvent e) {
        controller.changed();
    }

    // DocumentListener interface
    @Override
    public void changedUpdate(DocumentEvent e) {
        controller.changed();
    }

    // ChangeListener interface
    @Override
    public void stateChanged(ChangeEvent e) {
        controller.changed();
    }

    // Actionistener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        controller.changed();
    }
}

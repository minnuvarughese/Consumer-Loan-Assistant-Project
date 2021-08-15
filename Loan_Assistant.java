package loanassistant;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.text.*;
public class loanassistant extends javax.swing.JFrame {
	public loanassistant() {
        initComponents();
        this.setLocationRelativeTo(null);   // Allign form to the centre
        computeMButton.setEnabled(false);
        computePButton.setEnabled(false);
        newButton.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        balanceTextField = new javax.swing.JTextField();
        interestLabel = new javax.swing.JLabel();
        interestTextField = new javax.swing.JTextField();
        monthsLabel = new javax.swing.JLabel();
        monthsTextField = new javax.swing.JTextField();
        paymentLabel = new javax.swing.JLabel();
        paymentTextField = new javax.swing.JTextField();
        computePButton = new javax.swing.JButton();
        computeMButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LoanAnalysisTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setText("Loan Assistant");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        balanceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        balanceLabel.setText("Loan Balance");

        balanceTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        balanceTextField.setToolTipText("Enter the amount that is yet to pay.");
        balanceTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        interestLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        interestLabel.setText("Interest Rate");

        interestTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        interestTextField.setToolTipText("Interest Rate that bank has given you");
        interestTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        monthsLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        monthsLabel.setText("Number of Payments");

        monthsTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        monthsTextField.setToolTipText("No. of months required to pay all the dues");
        monthsTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        monthsTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthsTextFieldMouseClicked(evt);
            }
        });

        paymentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        paymentLabel.setText("Monthly Payment");
        paymentLabel.setToolTipText("");

        paymentTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        paymentTextField.setToolTipText("Your monthly income");
        paymentTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        paymentTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentTextFieldMouseClicked(evt);
            }
        });

        computePButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        computePButton.setText("Compute No. of Payments");
        computePButton.setToolTipText("compute number of payments you need to make");
        computePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computePButtonActionPerformed(evt);
            }
        });

        computeMButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        computeMButton.setText("Compute Monthly Payment");
        computeMButton.setToolTipText("Compute monthly payment");
        computeMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeMButtonActionPerformed(evt);
            }
        });

        newButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        newButton.setText("New Loan Analysis");
        newButton.setToolTipText("Analyse another loan");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        LoanAnalysisTextArea.setColumns(20);
        LoanAnalysisTextArea.setFont(new java.awt.Font("Tahoma", 0, 16)); 
        LoanAnalysisTextArea.setRows(5);
        LoanAnalysisTextArea.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        jScrollPane1.setViewportView(LoanAnalysisTextArea);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel2.setText("Loan Analysis");

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        exitButton.setText("EXIT");
        exitButton.setToolTipText("Exit the system");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(interestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(balanceLabel))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(interestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monthsLabel)
                                    .addComponent(paymentLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(123, 123, 123))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(computePButton)
                        .addGap(18, 18, 18)
                        .addComponent(computeMButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newButton)
                        .addGap(140, 140, 140)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(interestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(interestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(monthsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(computePButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(computeMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
    }

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {
        computeMButton.setEnabled(false);
        computePButton.setEnabled(false);
        balanceTextField.setText("");
        interestTextField.setText("");
        paymentTextField.setText("");
        monthsTextField.setText("");
        monthsTextField.setBackground(Color.white);
        paymentTextField.setBackground(Color.white);
        LoanAnalysisTextArea.setText("");
    }

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0); 
    }

    private void computePButtonActionPerformed(java.awt.event.ActionEvent evt) {
       
        double balance, interest, payment, monthlyInterest, multiplier  ;
        int months;
        double loanBalance, finalBalance;
        
        
        if(validateDecimalNumber(balanceTextField)) {
            balance = Double.valueOf(balanceTextField.getText()).doubleValue();
        }
        else {
            JOptionPane.showConfirmDialog(null, "Invalid or Empty Loan Balance field.\n Please enter the correct value.",
                    "Loan Balance Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(validateDecimalNumber(interestTextField)) {
            interest = Double.valueOf(interestTextField.getText()).doubleValue();
        }
        else {
            JOptionPane.showConfirmDialog(null, "Invalid or Empty Interest field.\n Please enter the correct value.",
                    "Interest Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
              
        monthlyInterest = interest/1200;
        
       
        if(validateDecimalNumber(paymentTextField)) {
            payment = Double.valueOf(paymentTextField.getText()).doubleValue();
            if(payment <= (balance*monthlyInterest+1.0)) {
                if (JOptionPane.showConfirmDialog(null, "Minimum payment must be $" + new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0))
                        + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    paymentTextField.setText(new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)));
                    payment = Double.valueOf(paymentTextField.getText()).doubleValue();
                    
                }
                else {
                    return ;
                }
            }
        }
        else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry. \n Please correct.", "Payment Input Error",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE) ;
                    return ;
        }
        if ( interest == 0 ) {
            months = (int)(balance / payment) ;
        }
        else {
            months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest))/Math.log(1 + monthlyInterest));
        }
        monthsTextField.setText(String.valueOf(months));
        
        // reset the value of payment prior to two decimal places
        payment = Double.valueOf(paymentTextField.getText()).doubleValue();
        
        // show analysis
        LoanAnalysisTextArea.setText("\n Loan Balance: ₹ " + new DecimalFormat("0.00").format(balance));
        LoanAnalysisTextArea.append("\n" + " Interest Rate: " + new DecimalFormat("0.00").format(interest) + "%");
        
        // process all 
        loanBalance = balance ;
        for (int paymentNumber = 1; paymentNumber <= months-1; paymentNumber++) {
            loanBalance+=loanBalance*monthlyInterest-payment ;
            
        }
        // final payment
        finalBalance = loanBalance;
        if (finalBalance > payment) {
            // aplly one more payment
            loanBalance+=loanBalance*monthlyInterest-payment;
            finalBalance = loanBalance;
            months++;
            monthsTextField.setText(String.valueOf(months));
        }
        LoanAnalysisTextArea.append("\n\n "+String.valueOf(months-1)+" Payment of ₹ "+new DecimalFormat("0.00").format(payment));
        LoanAnalysisTextArea.append("\n"+" Final Payment of: ₹ "+new DecimalFormat("0.00").format(finalBalance));
        LoanAnalysisTextArea.append("\n"+" Total Payments: ₹ "+new DecimalFormat("0.00").format((months-1)*payment+finalBalance));
        LoanAnalysisTextArea.append("\n"+" Interest Paid: ₹ "+new DecimalFormat("0.00").format((months-1)*payment+finalBalance-balance));
        
        computePButton.setEnabled(true);
        computeMButton.setEnabled(false);
        newButton.setEnabled(true);
    }

    private void computeMButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        double balance, interest, payment, monthlyInterest, multiplier, loanBalance, finalBalance;
        int months;
        if(validateDecimalNumber(balanceTextField)) {
            balance = Double.valueOf(balanceTextField.getText()).doubleValue();
        }
        else {
            JOptionPane.showConfirmDialog(null, " Invalid or Empty Loan Balance entry.\n Please correct it.",
                    "\n Loan Balance Input Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        if(validateDecimalNumber(interestTextField)) {
            interest = Double.valueOf(interestTextField.getText()).doubleValue();
        }
        else {
            JOptionPane.showConfirmDialog(null, " Invalid or Empty Interest Rate entry. \n Please correct it.",
                    "\n Interest Rate Input Error", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        monthlyInterest = interest/1200;
        
        // now compute the monthly income of the person
        if(validateDecimalNumber(monthsTextField)) {
            months = Integer.valueOf(monthsTextField.getText()).intValue();
        }
        else {
            JOptionPane.showConfirmDialog(null, " Invalid or Empty No. of Payments entry. \n Please correct it.",
                    "\n No. of Payments Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (interest == 0) {
            payment = balance / months ;
        }
        else {
            multiplier = Math.pow(1+monthlyInterest, months);
            payment = balance * monthlyInterest * multiplier / (multiplier-1) ;
        }
        paymentTextField.setText(new DecimalFormat("0.00").format(payment)) ;
        
        // reset the value of payment and fix it to the two decimal places
        payment = Double.valueOf(paymentTextField.getText()).doubleValue();
        
        // now its time to show the analysis on the LoanAnalysistextarea
        // show analysis
        LoanAnalysisTextArea.setText("\n Loan Balance: ₹ " + new DecimalFormat("0.00").format(balance));
        LoanAnalysisTextArea.append("\n" + " Interest Rate: " + new DecimalFormat("0.00").format(interest) + "%");
        
        // process all 
        loanBalance = balance ;
        for (int paymentNumber = 1; paymentNumber <= months-1; paymentNumber++) {
            loanBalance+=loanBalance*monthlyInterest-payment ;
            
        }
        // final payment
        finalBalance = loanBalance;
        if (finalBalance > payment) {
            // aplly one more payment
            loanBalance+=loanBalance*monthlyInterest-payment;
            finalBalance = loanBalance;
            months++;
            monthsTextField.setText(String.valueOf(months));
        }
        LoanAnalysisTextArea.append("\n\n "+String.valueOf(months-1)+" Payment of ₹ "+new DecimalFormat("0.00").format(payment));
        LoanAnalysisTextArea.append("\n"+" Final Payment of: ₹ "+new DecimalFormat("0.00").format(finalBalance));
        LoanAnalysisTextArea.append("\n"+" Total Payments: ₹ "+new DecimalFormat("0.00").format((months-1)*payment+finalBalance));
        LoanAnalysisTextArea.append("\n"+" Interest Paid: ₹ "+new DecimalFormat("0.00").format((months-1)*payment+finalBalance-balance));
        
        computeMButton.setEnabled(true);
        computePButton.setEnabled(false);
        newButton.setEnabled(true);
    }

    private void monthsTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
        computePButton.setVisible(true);
        computePButton.setEnabled(false);
        computeMButton.setVisible(true);
        computeMButton.setEnabled(true);
        
        
        Color lightYellow = new Color(255,255,128);
        Color white = new Color(255,255,255);
        
        
        paymentTextField.setText("");
        paymentTextField.setBackground(lightYellow);
        paymentTextField.setEditable(false);
        
       
        monthsTextField.setEditable(true);
        monthsTextField.setBackground(white);
    }

    private void paymentTextFieldMouseClicked(java.awt.event.MouseEvent evt) {
        computePButton.setVisible(true);
        computeMButton.setVisible(true);
        computePButton.setEnabled(true);
        computeMButton.setEnabled(false);
        
        
        Color lightYellow = new Color(255,255,128);
        Color white = new Color(255,255,255);
        
        
        paymentTextField.setBackground(white);
        paymentTextField.setEditable(true);
        
        // now for monthsTextField
        monthsTextField.setText("");
        monthsTextField.setBackground(lightYellow);
        monthsTextField.setEditable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loanassistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loanassistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loanassistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loanassistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loanassistant().setVisible(true);
            }
        });
    }

    
    private javax.swing.JTextArea LoanAnalysisTextArea;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton computeMButton;
    private javax.swing.JButton computePButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel interestLabel;
    private javax.swing.JTextField interestTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel monthsLabel;
    private javax.swing.JTextField monthsTextField;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JTextField paymentTextField;
    

    private boolean validateDecimalNumber(JTextField balanceTextField) {    
        
        
        String s = balanceTextField.getText().trim();
        boolean hasDecimal = false;
        boolean valid = true;
        if(s.length() == 0) {
            valid = false;
        }
        else {
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if (c>='0' && c<='9') {
                    continue;
                }
                else if(c=='.' && !hasDecimal) {
                    hasDecimal = true;
                }
                else {
                    
                    valid = false;
                }
            }
        }
        balanceTextField.setText(s);
        if(!valid) {
            
        }
        else {
            return (valid);
        }
        return false;
    }
}


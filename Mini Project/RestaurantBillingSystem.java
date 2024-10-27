import java.awt.*;
import java.awt.print.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.*;

public class RestaurantBillingSystem extends JFrame {

    private JTextField customerField, cashierField, timeField, dateField, totalField;
    private JTextArea receiptArea;
    private JButton printButton, clearButton;
    private JLabel totalLabel;
    private HashMap<String, int[]> menuItems;

    public RestaurantBillingSystem() {
        setTitle("Restaurant Billing System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize);
        setLayout(null);

        menuItems = new HashMap<>();
        menuItems.put("Pizza", new int[]{149, 0});
        menuItems.put("Burger", new int[]{59, 0});
        menuItems.put("Soda", new int[]{29, 0});

        Font labelFont = new Font("Arial", Font.BOLD, 28);
        Font buttonFont = new Font("Arial", Font.PLAIN, 24);
        Font textAreaFont = new Font("Arial", Font.PLAIN, 20);

        JLabel customerLabel = new JLabel("Customer:");
        customerLabel.setBounds(50, 50, 200, 40);
        customerLabel.setFont(labelFont);
        add(customerLabel);

        customerField = new JTextField();
        customerField.setBounds(260, 50, 300, 40);
        customerField.setFont(buttonFont);
        add(customerField);

        JLabel cashierLabel = new JLabel("Cashier:");
        cashierLabel.setBounds(50, 110, 200, 40);
        cashierLabel.setFont(labelFont);
        add(cashierLabel);

        cashierField = new JTextField();
        cashierField.setBounds(260, 110, 300, 40);
        cashierField.setFont(buttonFont);
        add(cashierField);

        JLabel timeLabel = new JLabel("Time:");
        timeLabel.setBounds(50, 170, 200, 40);
        timeLabel.setFont(labelFont);
        add(timeLabel);

        timeField = new JTextField();
        timeField.setBounds(260, 170, 300, 40);
        timeField.setEditable(false);
        timeField.setFont(buttonFont);
        add(timeField);

        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(50, 230, 200, 40);
        dateLabel.setFont(labelFont);
        add(dateLabel);

        dateField = new JTextField();
        dateField.setBounds(260, 230, 300, 40);
        dateField.setEditable(false);
        dateField.setFont(buttonFont);
        add(dateField);

        JLabel menuLabel = new JLabel("MENU:");
        menuLabel.setBounds(50, 290, 200, 40);
        menuLabel.setFont(labelFont);
        add(menuLabel);

        JButton pizzaAddButton = new JButton("+");
        pizzaAddButton.setBounds(260, 350, 70, 40);
        pizzaAddButton.setFont(buttonFont);
        add(pizzaAddButton);

        JButton pizzaSubtractButton = new JButton("-");
        pizzaSubtractButton.setBounds(340, 350, 70, 40);
        pizzaSubtractButton.setFont(buttonFont);
        add(pizzaSubtractButton);

        JLabel pizzaLabel = new JLabel("1. Pizza    ₹149");
        pizzaLabel.setBounds(50, 350, 200, 40);
        pizzaLabel.setFont(labelFont);
        add(pizzaLabel);

        JButton burgerAddButton = new JButton("+");
        burgerAddButton.setBounds(260, 410, 70, 40);
        burgerAddButton.setFont(buttonFont);
        add(burgerAddButton);

        JButton burgerSubtractButton = new JButton("-");
        burgerSubtractButton.setBounds(340, 410, 70, 40);
        burgerSubtractButton.setFont(buttonFont);
        add(burgerSubtractButton);

        JLabel burgerLabel = new JLabel("2. Burger  ₹59");
        burgerLabel.setBounds(50, 410, 200, 40);
        burgerLabel.setFont(labelFont);
        add(burgerLabel);

        JButton sodaAddButton = new JButton("+");
        sodaAddButton.setBounds(260, 470, 70, 40);
        sodaAddButton.setFont(buttonFont);
        add(sodaAddButton);

        JButton sodaSubtractButton = new JButton("-");
        sodaSubtractButton.setBounds(340, 470, 70, 40);
        sodaSubtractButton.setFont(buttonFont);
        add(sodaSubtractButton);

        JLabel sodaLabel = new JLabel("3. Soda     ₹29");
        sodaLabel.setBounds(50, 470, 200, 40);
        sodaLabel.setFont(labelFont);
        add(sodaLabel);

        JLabel receiptLabel = new JLabel("RECEIPT:");
        receiptLabel.setBounds(600, 50, 200, 40);
        receiptLabel.setFont(labelFont);
        add(receiptLabel);

        receiptArea = new JTextArea();
        receiptArea.setBounds(600, 100, 600, 400);
        receiptArea.setEditable(false);
        receiptArea.setFont(textAreaFont);
        receiptArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(receiptArea);

        JLabel totalTextLabel = new JLabel("TOTAL:");
        totalTextLabel.setBounds(600, 520, 200, 40);
        totalTextLabel.setFont(labelFont);
        add(totalTextLabel);

        totalField = new JTextField();
        totalField.setBounds(760, 520, 300, 40);
        totalField.setEditable(false);
        totalField.setFont(buttonFont);
        add(totalField);

        printButton = new JButton("PRINT");
        printButton.setBounds(600, 580, 200, 50);
        printButton.setFont(buttonFont);
        add(printButton);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(900, 580, 200, 50);
        clearButton.setFont(buttonFont);
        add(clearButton);

        setCurrentTimeAndDate();

        pizzaAddButton.addActionListener(e -> addItemToReceipt("Pizza"));
        pizzaSubtractButton.addActionListener(e -> subtractItemFromReceipt("Pizza"));
        burgerAddButton.addActionListener(e -> addItemToReceipt("Burger"));
        burgerSubtractButton.addActionListener(e -> subtractItemFromReceipt("Burger"));
        sodaAddButton.addActionListener(e -> addItemToReceipt("Soda"));
        sodaSubtractButton.addActionListener(e -> subtractItemFromReceipt("Soda"));

        printButton.addActionListener(e -> printBill());
        clearButton.addActionListener(e -> clearFields());
    }

    private void setCurrentTimeAndDate() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date now = new Date();
        timeField.setText(timeFormat.format(now));
        dateField.setText(dateFormat.format(now));
    }

    private void addItemToReceipt(String itemName) {
        int[] itemData = menuItems.get(itemName);
        itemData[1]++;
        menuItems.put(itemName, itemData);
        updateReceipt();
    }

    private void subtractItemFromReceipt(String itemName) {
        int[] itemData = menuItems.get(itemName);
        if (itemData[1] > 0) {
            itemData[1]--;
        }
        menuItems.put(itemName, itemData);
        updateReceipt();
    }

    private void updateReceipt() {
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("Item           Quantity     Total\n");
        receiptText.append("----------------------------------------\n");

        int totalAmount = 0;
        for (String itemName : menuItems.keySet()) {
            int[] itemData = menuItems.get(itemName);
            int price = itemData[0];
            int qty = itemData[1];

            if (qty > 0) {
                int itemTotal = price * qty;
                receiptText.append(String.format("%-17s%-14d₹%d\n", itemName, qty, itemTotal));
                totalAmount += itemTotal;
            }
        }

        receiptArea.setText(receiptText.toString());
        totalField.setText("₹" + totalAmount);
    }

private void printBill() {
    PrinterJob job = PrinterJob.getPrinterJob();
    job.setJobName("Restaurant Bill");

    job.setPrintable(new Printable() {
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex > 0) {
                return NO_SUCH_PAGE;
            }
            
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            g2d.setFont(new Font("Arial", Font.PLAIN, 12));

            String[] lines = receiptArea.getText().split("\n");
            int y = 15;
            for (String line : lines) {
                g2d.drawString(line, 0, y);
                y += 15;
            }
            g2d.drawString("Total: " + totalField.getText(), 0, y + 15);

            return PAGE_EXISTS;
        }
    });

    boolean doPrint = job.printDialog();
    if (doPrint) {
        try {
            job.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }
}


    private void clearFields() {
        customerField.setText("");
        cashierField.setText("");
        receiptArea.setText("");
        totalField.setText("");
        setCurrentTimeAndDate();

        for (String itemName : menuItems.keySet()) {
            menuItems.get(itemName)[1] = 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RestaurantBillingSystem().setVisible(true));
    }
}
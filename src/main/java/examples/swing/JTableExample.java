package examples.swing;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;

public class JTableExample extends JFrame {
    public static void main(String[] args) {
        JTableExample table = new JTableExample();
        table.setVisible(true);
    }

    public JTableExample() {
        super("JTable Example");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);

        TableModel tableModel = new MyTableModel();

        JTable table = new JTable(tableModel);
        tableModel.addTableModelListener(e -> System.out.println("Table Updated!"));
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(200);

        JScrollPane sp = new JScrollPane(table);
        this.add(sp);

        tableModel.setValueAt("James", 0, 0);

        table.setAutoCreateRowSorter(true);
        final TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableModel);
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("James"));
    }
}

class MyTableModel extends AbstractTableModel {
    String[] columns = {"Employee Name", "Job Title", "Salary"};
    Object[][] data = {{"Bob", "Programmer", 19000}, {"Alice", "Programmer", 19000}};

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = value;
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}

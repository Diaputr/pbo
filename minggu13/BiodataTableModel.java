package minggu14;
import javax.swing.table.AbstractTableModel;
public class BiodataTableModel extends AbstractTableModel {
    private Biodata[] data;
    private String[] namaKolom;

    public BiodataTableModel(Biodata[] data) {
        this.data = data;
        this.namaKolom = new String[]{
            "Nim",
            "Nama",
            "Jurusan",
            "Gender",
            "Membaca",
            "Tidur",
            "Makan",
            "Alamat"
        };
    }
    
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return namaKolom.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return namaKolom[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex < 4) {
            return String.class;
        } else if (columnIndex == 7) {
            return String.class;
        } else {
            return Boolean.class;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return data[rowIndex].getNim();
            case 1:
                return data[rowIndex].getNama();
            case 2:
                return data[rowIndex].getJurusan();
            case 3:
                return data[rowIndex].getGender();
            case 4:
                return data[rowIndex].isBaca();
            case 5:
                return data[rowIndex].isMakan();
            case 6:
                return data[rowIndex].isTidur();
            case 7:
                return data[rowIndex].getAlamat();
        }
        return null;
    }
}


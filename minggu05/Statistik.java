package latihan;
public class Statistik {
    int[] dataArr = {20,50,3,4,1,23,16,45,32,22};
    
    int sum(){
        int sum = 0;
        for (int i : dataArr) {
            sum +=i;
        }
        return sum;
    }
    
    float average() {
        return (float) sum()/dataArr.length;
    }

    int max() {
        int max = dataArr[0];
        for (int i = 1; i < dataArr.length; i++) {
            if (dataArr[i] > max) {
                max = dataArr[i];
            }
        }   
        return max;
    }
    
    int min() {
        int min = dataArr[0];
        for (int i = 1; i < dataArr.length; i++) {
            if (dataArr[i] < min) {
                min = dataArr[i];
            }
        }   
        return min;
    }
    
    void bubbleSort(){
        for (int i : dataArr) {
            for(int j=0; j<dataArr.length-1; j++){
                if(dataArr[j] > dataArr[j+1]){
                    int tmp = dataArr[j];
                    dataArr[j] = dataArr[j+1];
                    dataArr[j+1] = tmp;
                }
            }
        }
    }
    
    int med(){
        bubbleSort();
        int med = 0;
        int n = dataArr.length;
        if(n %2 == 0){
            med = (dataArr[n/2]+dataArr[(n/2)-1])/2;
        } else {
            med = dataArr[n/2];
        }
        return med;
    }
    
    void tampilData(){
        for (int i : dataArr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Statistik s = new Statistik();
        s.tampilData();
        System.out.println("SUM : "+s.sum());
        System.out.println("AVG : "+s.average());
        System.out.println("MAX : "+s.max());
        System.out.println("MIN : "+s.min());
        System.out.println("MED : "+s.med());
        s.tampilData();
    }
}
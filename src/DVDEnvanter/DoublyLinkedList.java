
import java.util.ArrayList;

public class DoublyLinkedList {
    
    static Node head;
    static Node tail;
    static int size=0;
    static ArrayList<String> musics;
    
    
    public int compareDate(int newNode, int compareNode) { //tarih karşılaştırmak için fonksiyon
        if(newNode < compareNode) { 
            return -1 ;
        }
        else {
            return 1;
        }
    }
    
    public int compareAdSoyad(String newNode, String compareNode) { //ad ve soyad karşılaştırmak için fonksiyon
        
        int longerWordlength;
        int difference1 = newNode.length()-compareNode.length();
        int difference2 = compareNode.length()-newNode.length();
        
        if ( compareNode.length() < newNode.length()) 
        {
            longerWordlength = newNode.length();
            for(int i=0; i < difference1; i++){
                compareNode += " ";
            }
        }
        else
        {
            longerWordlength = compareNode.length();
            for(int i=0; i < difference2 ; i++) {
                newNode += " ";
            }
        }
        
        byte[] compareNodeByte = compareNode.toLowerCase().getBytes();
        byte[] newNodeByte = newNode.toLowerCase().getBytes();
        
        for (int i=0; i < longerWordlength; i++) {
            if (compareNodeByte[i] > newNodeByte[i]) {
                return -1;
            }
            else if (compareNodeByte[i] < newNodeByte[i]) {
                return 1;
            }
        }
        return 0;
        
    }
    
    public void add(DVD data) { //envantere sanatçı eklemek için fonksiyon
        Node newNode = new Node(data);
        Node compareNode = head;
        
        while (compareNode != null) {
            
            int value = compareAdSoyad(newNode.data.getAdSoyad(), compareNode.data.getAdSoyad());
            
            if(value == -1)
            {
                if (compareNode.previous ==null) {
                    compareNode.previous = newNode;
                    newNode.next = compareNode;
                    head = newNode;
                    musics = newNode.data.sarkiIsimleri;
                    size++;
                    return;
                }
                else {
                    compareNode.previous.next = newNode;
                    newNode.next = compareNode;
                    newNode.previous = compareNode.previous;
                    compareNode.previous = newNode;
                    //head = newNode;
                    musics = newNode.data.sarkiIsimleri;
                    size++;
                    return;
                    
                }
            }
            
            else if(value == 1) 
            {
                if(compareNode.next == null) {
                    compareNode.next = newNode;
                    newNode.previous = compareNode;
                    tail = newNode;
                    musics = newNode.data.sarkiIsimleri;
                    size++;
                    return;
                }
                else {
                    compareNode = compareNode.next;
                }
            }
            else 
            {
                int dateValue = compareDate(newNode.data.getCikisTarihi(), compareNode.data.getCikisTarihi());
                if (dateValue == -1 && newNode.data.getAdSoyad().toLowerCase().equals(compareNode.data.getAdSoyad().toLowerCase())) 
                {
                    if (compareNode.previous == null) {
                        compareNode.previous = newNode;
                        newNode.next = compareNode;
                        head = newNode;
                        musics = newNode.data.sarkiIsimleri;
                        size++;
                        return;
                    }
                    else {
                        compareNode.previous.next = newNode;
                        newNode.next = compareNode;
                        newNode.previous = compareNode.previous;
                        compareNode.previous = newNode;
                        musics = newNode.data.sarkiIsimleri;
                        size++;
                        return;
                    }
                }
                else 
                {
                   if (newNode.data.getAdSoyad().toLowerCase().equals(compareNode.data.getAdSoyad().toLowerCase())) {
                       if (compareNode.next == null) {
                           compareNode.next = newNode;
                           newNode.previous = compareNode;
                           tail = newNode;
                           musics = newNode.data.sarkiIsimleri;
                           size++;
                           return;
                       }
                       else {
                           compareNode = compareNode.next;
                       }
                   }
                   else {
                       compareNode.previous.next = newNode;
                       newNode.previous = compareNode.previous;
                       newNode.next = compareNode;
                       compareNode.previous = newNode;
                       musics = newNode.data.sarkiIsimleri;
                       size++;
                       return;
                   }
                }  
            }  
        }
        if (head == null) {
            head = tail = newNode;
            musics = tail.data.sarkiIsimleri;
            size++;
        }
        
    }
    
    public void deleteNode(String adSoyad, String album){ //envanterden sanatçı silmek için kullanılan fonksiyon
        Node compareNode = head;
        while (compareNode != null) {
            if (compareNode.data.getAdSoyad().toLowerCase().equals(adSoyad.toLowerCase())) {
                if(compareNode.data.getDvdBasligi().toLowerCase().equals(album.toLowerCase())) {
                    if(compareNode.previous == null) {
                    head = compareNode.next;
                    compareNode.next.previous = null;
                    size--;
                    
                    }
                
                else if (compareNode.next == null) {
                    tail = compareNode.previous;
                    compareNode.previous.next = null;
                    size--;
                    
                }
                else {
                    compareNode.previous.next = compareNode.next;
                    compareNode.next.previous = compareNode.previous;
                    size--;
                }
                }
            }
            compareNode = compareNode.next;
        }
        
    }
    
    public  Node find1(String targetAS, String targetAB) //ad-soyad ve albüm başlığı parametreleri ile istenilen node'u bulan fonksiyon
    {
        Node position = head;
        String itemAtPositionAS;
        String itemAtPositionAB;
        while (position != null)
        {
            itemAtPositionAS = position.data.getAdSoyad();
            itemAtPositionAB = position.data.getDvdBasligi();
            if (itemAtPositionAS.equals(targetAS) || itemAtPositionAB.equalsIgnoreCase(targetAB) )
                return position;
            position = position.next;
        }
        return null;
    }
    
    public  Node find2(String targetAS) //ad-soyad parametresine göre istenilen node'u bulan fonksiyon
    {
        Node position = head;
        String itemAtPositionAS;
        String itemAtPositionAB;
        while (position != null)
        {
            itemAtPositionAS = position.data.getAdSoyad();
            itemAtPositionAB = position.data.getDvdBasligi();
            if (itemAtPositionAS.equals(targetAS))
                return position;
            position = position.next;
        }
        return null;
    }
    
    public String print() { //linkedlisti baştan sona yazdıran fonksiyon
        Node tmpNode = head;
        String data = "";
        while (tmpNode != null) {
            data += tmpNode.data.getAdSoyad() + " " + tmpNode.data.getDvdBasligi() + " " +
                    tmpNode.data.getCikisTarihi() + " " + tmpNode.data.getFiyatBilgisi()
                    + " " + tmpNode.data.sarkiIsimleri
                    + "\n";
            tmpNode = tmpNode.next;
        }
        return data;
    }
    
    public String printTersten() { //linkedlisti tersten yazdıran fonksiyon
        Node tmpNode = tail;
        String data = "";
        while (tmpNode != null) {
            data += tmpNode.data.getAdSoyad() + " " + tmpNode.data.getDvdBasligi() + " " +
                    tmpNode.data.getCikisTarihi() + " " + tmpNode.data.getFiyatBilgisi()
                    + " " + tmpNode.data.sarkiIsimleri
                    + "\n";
            tmpNode = tmpNode.previous;
        }
        return data;
    }
    
    public String print2000() { //2000 yılından önce çıkan albümleri yazdıran fonksiyon
        Node tmpNode = head;
        String data = "";
        while (tmpNode != null) {
            if (tmpNode.data.getCikisTarihi() < 2000) 
            {
            data += tmpNode.data.getAdSoyad() + " " + tmpNode.data.getDvdBasligi() + " " +
                    tmpNode.data.getCikisTarihi() + " " + tmpNode.data.getFiyatBilgisi()
                    + " " + tmpNode.data.sarkiIsimleri
                    + "\n";
            }
            tmpNode = tmpNode.next;
        }
        return data;
    }
}



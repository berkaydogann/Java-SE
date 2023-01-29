package useFile;

import java.util.List;

public class MainFile {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        //boolean createStatus = dataStore.createFile();
        //System.out.println("Create Status: " + createStatus);
        //boolean deleteStatus = dataStore.deleteFile();
        //System.out.println("Delete status: " + deleteStatus);

        //dataStore.addData("Java Note");

//        try {
//            int i = 1 / 0;
//        } catch (Exception ex) {
//            dataStore.addData(ex.getStackTrace()[0].toString());
//        }
        List<String> ls = dataStore.readData();
        for(String item: ls){
            System.out.println(item);
        }
    }


}

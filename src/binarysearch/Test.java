package binarysearch;


import java.io.File;

/*PAth of a perticular delete a file from a directory is directory is empty then delete the directory.
*file is deleted from the directory then delete the file from the directory.
*
* */
public class Test {

    public static void deleteFile(String path){
        File file = new File(path);

        if(file.isDirectory()){
            File[] files = file.listFiles();
            System.out.println("file length of "+ file.getAbsolutePath()+ " is "+files.length);
            if(files.length == 0){
                file.delete();
                System.out.println(file.getName() + " is deleted");
                System.out.println(file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf("/")));

            }else{
                for(File f : files){
                    System.out.println("file name is "+f.getName());
                    deleteFile(f.getAbsolutePath());
                }
            }
        }

    }

    public static void main(String[] args) {
        deleteFile("/Users/vikrantkumar/Desktop/vvv");

    }

}

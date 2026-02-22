//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);
        File file3 = new File("file3.txt", 30);

        Directory folderA = new Directory("FolderA");
        Directory folderB = new Directory("FolderB");
        Directory root = new Directory("Root");
        Directory cDisk = new Directory("C:/");
        Directory dDick = new Directory("D:/");

        folderA.add(file1);
        folderA.add(file2);

        folderB.add(file3);

        root.add(folderA);
        root.add(folderB);

        cDisk.add(root);

        cDisk.printStructure("");
        System.out.println("Total Size: " + cDisk.getSize() + "KB\n");

        root.remove(folderA);

        dDick.add(root);

        dDick.printStructure("");
        System.out.println("Total Size: " + dDick.getSize() + "KB\n");

    }
}
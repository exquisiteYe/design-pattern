package xyDemo.studyComposite.exp1;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 假设我们有这样一个需求：设计一个类来表示文件系统中的目录，能方便地实现下面这些功能：
 *  1.动态地添加、删除某个目录下的子目录或文件；
 *  2.统计指定目录下的文件个数；
 *  3.统计指定目录下的文件总大小。
 */
public class FileSystemNodeOld {
    private String path;  // 文件路径
    private boolean isFile;  // 是不是文件
    private List<FileSystemNodeOld> subNodes = new ArrayList<>();

    public FileSystemNodeOld(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    /**
     * 统计指定目录下的文件个数(递归)
     */
    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        int numOfFiles = 0;
        for (FileSystemNodeOld fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    /**
     * 统计指定目录下的文件总大小(递归)
     */
    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);   // 文件大小
            if (!file.exists())
                return 0;
            return file.length();
        }
        long sizeOfFiles = 0;
        for (FileSystemNodeOld fileOrDir: subNodes) {
            sizeOfFiles += fileOrDir.countSizeOfFiles();
        }
        return sizeOfFiles;
    }

    public String getPath() {
        return path;
    }

    /**
     * 动态地添加某个目录下的子目录或文件
     */
    public void addSubNode(FileSystemNodeOld fileOrDir) {
        subNodes.add(fileOrDir);
    }

    /**
     * 动态地删除某个目录下的子目录或文件
     */
    public void removeSubNode(FileSystemNodeOld fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}

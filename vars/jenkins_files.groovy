import groovy.io.FileType


def readFilefromCurrentDirectory() {
    File dir = new File(".")
    dir.eachFile(FileType.FILES) { File file ->
        println file.name
    }
}

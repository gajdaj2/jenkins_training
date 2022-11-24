import groovy.io.FileType

print("Hello world")

def readFilefromCurrentDirectory() {
    File dir = new File(".")
    dir.eachFile(FileType.FILES) { File file ->
        println file.name
    }
}


readFilefromCurrentDirectory()
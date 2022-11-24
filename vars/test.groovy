import groovy.io.FileType


def call(Map config=[:]) {
    File dir = new File(".")
    dir.eachFile(FileType.FILES) { File file ->
        println file.name
    }
}

import groovy.io.FileType

@NonCPS
def call(Map config=[:]) {
    File dir = new File(".")
    dir.eachFile(FileType.FILES) { File file ->
        println file.name
    }
}

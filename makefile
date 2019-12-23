JCC=javac
JFLAGS= -g
all: jar

jar: classes
	jar cfm tarea.jar manifest.mf -C build/classes .


classes: dir
	$(JCC) $(JFLAGS) -sourcepath src/ -d build/classes src/*.java

dir:
	if [ ! -d build/classes ]; then mkdir -p build/classes; fi
	if [ ! -d build/jar ]; then mkdir -p build/jar; fi
clean:
	if [ -d build ]; then rm build -R; fi
	$(RM) tarea.jar

run:
	java -jar tarea.jar

# Java Template

This is an example Java Application Template.  This can be used to dive in quickly to Java development.

# How do I use this?

This template has a few basic dependencies, and an empty shell for tests, a main method, and other code.  You can generate project files for your IDE by doing the following:

    # for eclipse:
    ./gradlew eclipse
    # for idea:
    ./gradlew idea

You can now develop java!  Here are some helpful commands you might wish to run:

    # run your application
    ./gradlew run
    # run your tests
    ./gradlew test
    # generate a zip or tar you can distribute, which contains a wrapper script
    # and all your dependencies
    ./gradlew distZip
    ./gradlew distTar

    # code, then run this, then code some more:
    ./gradlew clean test run

# How was this created?

* Create an empty git repository
** `git init java-template`
** cd java-template
* Initialize the gradle wrapper - this ensures that people can run the build without installing gradle first, and that the same version of gradle is always used
** /path/to/gradle wrapper
* Create build.gradle
* Create settings.gradle - just used to set project name.  If you don't do this, it will use whatever name the current directory has, which is bad because it changes.
** All java projects use:  apply plugin: 'java'
** For IDE support, use the eclipse and idea plugins as well
** We put some common dependencies in there (guava, junit, etc)
** Apply the application plugin: https://docs.gradle.org/current/userguide/application_plugin.html
* Create the main class - src/main/java/org/cmyers/Main.java
* Create other classes - src/main/java/org/cmyers/People.java
* Create tests - src/test/java/org/cmyers/PeopleTest.java
* Create the .gitignore


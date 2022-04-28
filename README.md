# git-submodule-mss1

This one executes API rest call to mss1, via apiClient submodule implementations.

For the shake of simplicity there is not even MVC architecture implemented.

## Initial setup

Git clone repositories with `--recurse-submodules` option.

    git clone --recurse-submodules https://github.com/davidgfolchApium/gitsubmodule-mss1
    git clone --recurse-submodules https://github.com/davidgfolchApium/gitsubmodule-mss2

## Compile and Run
Be sure you are using jdk11 before:

    mvn clean install
    cd api && mvn spring-boot:run
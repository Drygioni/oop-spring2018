# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.5

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/jgboese/projects/CoffeeMug

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/jgboese/projects/CoffeeMug

# Include any dependencies generated for this target.
include CMakeFiles/sources.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/sources.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/sources.dir/flags.make

CMakeFiles/sources.dir/src/TestMain.cpp.o: CMakeFiles/sources.dir/flags.make
CMakeFiles/sources.dir/src/TestMain.cpp.o: src/TestMain.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/jgboese/projects/CoffeeMug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/sources.dir/src/TestMain.cpp.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/sources.dir/src/TestMain.cpp.o -c /home/jgboese/projects/CoffeeMug/src/TestMain.cpp

CMakeFiles/sources.dir/src/TestMain.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/sources.dir/src/TestMain.cpp.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/jgboese/projects/CoffeeMug/src/TestMain.cpp > CMakeFiles/sources.dir/src/TestMain.cpp.i

CMakeFiles/sources.dir/src/TestMain.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/sources.dir/src/TestMain.cpp.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/jgboese/projects/CoffeeMug/src/TestMain.cpp -o CMakeFiles/sources.dir/src/TestMain.cpp.s

CMakeFiles/sources.dir/src/TestMain.cpp.o.requires:

.PHONY : CMakeFiles/sources.dir/src/TestMain.cpp.o.requires

CMakeFiles/sources.dir/src/TestMain.cpp.o.provides: CMakeFiles/sources.dir/src/TestMain.cpp.o.requires
	$(MAKE) -f CMakeFiles/sources.dir/build.make CMakeFiles/sources.dir/src/TestMain.cpp.o.provides.build
.PHONY : CMakeFiles/sources.dir/src/TestMain.cpp.o.provides

CMakeFiles/sources.dir/src/TestMain.cpp.o.provides.build: CMakeFiles/sources.dir/src/TestMain.cpp.o


CMakeFiles/sources.dir/src/CoffeeMug.cpp.o: CMakeFiles/sources.dir/flags.make
CMakeFiles/sources.dir/src/CoffeeMug.cpp.o: src/CoffeeMug.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/jgboese/projects/CoffeeMug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/sources.dir/src/CoffeeMug.cpp.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/sources.dir/src/CoffeeMug.cpp.o -c /home/jgboese/projects/CoffeeMug/src/CoffeeMug.cpp

CMakeFiles/sources.dir/src/CoffeeMug.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/sources.dir/src/CoffeeMug.cpp.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/jgboese/projects/CoffeeMug/src/CoffeeMug.cpp > CMakeFiles/sources.dir/src/CoffeeMug.cpp.i

CMakeFiles/sources.dir/src/CoffeeMug.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/sources.dir/src/CoffeeMug.cpp.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/jgboese/projects/CoffeeMug/src/CoffeeMug.cpp -o CMakeFiles/sources.dir/src/CoffeeMug.cpp.s

CMakeFiles/sources.dir/src/CoffeeMug.cpp.o.requires:

.PHONY : CMakeFiles/sources.dir/src/CoffeeMug.cpp.o.requires

CMakeFiles/sources.dir/src/CoffeeMug.cpp.o.provides: CMakeFiles/sources.dir/src/CoffeeMug.cpp.o.requires
	$(MAKE) -f CMakeFiles/sources.dir/build.make CMakeFiles/sources.dir/src/CoffeeMug.cpp.o.provides.build
.PHONY : CMakeFiles/sources.dir/src/CoffeeMug.cpp.o.provides

CMakeFiles/sources.dir/src/CoffeeMug.cpp.o.provides.build: CMakeFiles/sources.dir/src/CoffeeMug.cpp.o


CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o: CMakeFiles/sources.dir/flags.make
CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o: src/TestCoffeeMug.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/jgboese/projects/CoffeeMug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o -c /home/jgboese/projects/CoffeeMug/src/TestCoffeeMug.cpp

CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/jgboese/projects/CoffeeMug/src/TestCoffeeMug.cpp > CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.i

CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/jgboese/projects/CoffeeMug/src/TestCoffeeMug.cpp -o CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.s

CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o.requires:

.PHONY : CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o.requires

CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o.provides: CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o.requires
	$(MAKE) -f CMakeFiles/sources.dir/build.make CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o.provides.build
.PHONY : CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o.provides

CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o.provides.build: CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o


# Object files for target sources
sources_OBJECTS = \
"CMakeFiles/sources.dir/src/TestMain.cpp.o" \
"CMakeFiles/sources.dir/src/CoffeeMug.cpp.o" \
"CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o"

# External object files for target sources
sources_EXTERNAL_OBJECTS =

lib/libsources.a: CMakeFiles/sources.dir/src/TestMain.cpp.o
lib/libsources.a: CMakeFiles/sources.dir/src/CoffeeMug.cpp.o
lib/libsources.a: CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o
lib/libsources.a: CMakeFiles/sources.dir/build.make
lib/libsources.a: CMakeFiles/sources.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/jgboese/projects/CoffeeMug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Linking CXX static library lib/libsources.a"
	$(CMAKE_COMMAND) -P CMakeFiles/sources.dir/cmake_clean_target.cmake
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/sources.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/sources.dir/build: lib/libsources.a

.PHONY : CMakeFiles/sources.dir/build

CMakeFiles/sources.dir/requires: CMakeFiles/sources.dir/src/TestMain.cpp.o.requires
CMakeFiles/sources.dir/requires: CMakeFiles/sources.dir/src/CoffeeMug.cpp.o.requires
CMakeFiles/sources.dir/requires: CMakeFiles/sources.dir/src/TestCoffeeMug.cpp.o.requires

.PHONY : CMakeFiles/sources.dir/requires

CMakeFiles/sources.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/sources.dir/cmake_clean.cmake
.PHONY : CMakeFiles/sources.dir/clean

CMakeFiles/sources.dir/depend:
	cd /home/jgboese/projects/CoffeeMug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/jgboese/projects/CoffeeMug /home/jgboese/projects/CoffeeMug /home/jgboese/projects/CoffeeMug /home/jgboese/projects/CoffeeMug /home/jgboese/projects/CoffeeMug/CMakeFiles/sources.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/sources.dir/depend


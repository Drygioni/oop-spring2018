file(REMOVE_RECURSE
  "bin/testCoffeeMug.pdb"
  "bin/testCoffeeMug"
)

# Per-language clean rules from dependency scanning.
foreach(lang )
  include(CMakeFiles/testCoffeeMug.dir/cmake_clean_${lang}.cmake OPTIONAL)
endforeach()

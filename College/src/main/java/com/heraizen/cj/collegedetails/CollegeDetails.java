package com.heraizen.cj.collegedetails;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface CollegeDetails {
 List<College>getAllColleges();
 List<College>getCollege(Predicate<College>p);
 Optional<College>getCollegeByName(String name);
 Optional<Integer>totalStudent();
 Optional<Integer>totalfaculties();
 List<College>sort(Comparator<College>c);

}

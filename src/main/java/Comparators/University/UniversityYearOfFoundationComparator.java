package Comparators.University;

import MainCode.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityYearOfFoundationComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return Integer.compare(o1.getYearOfFoundation(), o2.getYearOfFoundation());
    }
}

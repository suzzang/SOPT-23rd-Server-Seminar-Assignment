package org.sopt.service;

import org.sopt.model.University;

public interface UniversityService {

    University getByUnivName(final String univ_name);
}

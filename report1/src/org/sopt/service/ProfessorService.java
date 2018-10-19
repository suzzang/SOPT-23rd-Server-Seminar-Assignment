package org.sopt.service;

import org.sopt.model.Professor;

public interface ProfessorService {
    Professor getByProfessorNum(final int professor_num);
}

from unittest.mock import Mock

import pytest

from Tasks import Tasks


def test_find_average():
    assert Tasks.find_average([1, 4, 7, 2]) == 3.5


"""
Модифицируйте функцию find_average так, чтобы она вызывала исключение TypeError, если
ей передается не список.
Напишите тест, который проверяет вызов этого исключения
"""


def test_find_average_mod():
    with pytest.raises(TypeError):
        Tasks.find_average("1, 2, 3")

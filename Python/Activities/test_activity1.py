import pytest
import math

@pytest.mark.great
def test_sqrt():
   num = 25
   assert math.sqrt(num) == 5
@pytest.mark.great
def testsquare():
   num = 7
   assert num*num == 40

def tesequality():
   assert 10 == 11

   
class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        c = 0
        for row in grid:
            for val in row:
                if(val < 0):
                    c+=1
        return c
class Solution(object):
    def queryResults(self, limit, queries):
        """
        :type limit: int
        :type queries: List[List[int]]
        :rtype: List[int]
        """
        mapp = {}
        value = {}
        cnt = 0
        result =[]

        for x, y in queries:
            if x in mapp:
                old =mapp[x]

                value[old] -= 1

                if value[old]==0:
                    cnt -=1
            
            mapp[x] = y

            if y not in value or value[y]==0:
                value[y] = 1
                cnt += 1
            else:
                value[y] += 1
            

            result.append(cnt)
        return result
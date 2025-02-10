class Solution:
    def clearDigits(self, s: str) -> str:
        st = []
        for i in range(len(s)):
            if s[i].isdigit():
                st.pop()
            else:
                st.append(s[i])
        ans =  "".join(st)

        print(ans)
        return ans
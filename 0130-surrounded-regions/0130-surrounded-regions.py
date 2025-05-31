class Solution(object):
    def solve(self, board):
        """
        :type board: List[List[str]]
        :rtype: None Do not return anything, modify board in-place instead.
        """
        
        def bfs(board, m, n, x, y):
            q = collections.deque()
            region = []
            dx = [-1, 1, 0, 0]
            dy = [0,0,-1,1]
            IsChange = True
            if x == m-1 or y == n-1 or x == 0 or y == 0:
                IsChange = False
            region.append((x,y))
            q.append((x,y))
            while q:
                cx, cy = q.popleft()
                for i in range(4):
                    nx = cx + dx[i]
                    ny = cy + dy[i]

                    if 0<=nx < m and 0 <= ny <n:
                        if board[nx][ny] == "O" and (nx, ny) not in region:
                            if nx == m-1 or ny == n-1 or nx == 0 or ny == 0:
                                IsChange = False
                            region.append((nx,ny))
                            q.append((nx,ny))
            return IsChange, region

        m = len(board)
        n = len(board[0])
        visited = []
        for i in range(m):
            for j in range(n):
                if board[i][j] == "O" and (i, j) not in visited:
                    IsChange, region = bfs(board, m, n, i, j)
                    print(IsChange, region)
                    if IsChange:
                        for (x, y) in region:
                            board[x][y] = "X"
                    visited = visited + region
        
                    
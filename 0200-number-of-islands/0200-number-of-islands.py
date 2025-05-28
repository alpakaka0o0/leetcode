class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        def bfs(x, y, graph, m, n, cnt):
            dx = [-1, 1, 0, 0]
            dy = [0, 0, -1, 1]
            q = []
            q.append((x, y))
            graph[x][y] = cnt
            while q:
                cx, cy = q.pop()
                for i in range(4):
                    nx = cx + dx[i]
                    ny = cy + dy[i]
                    if 0<=nx < m and 0<=ny < n:
                        if graph[nx][ny] == "1":
                            graph[nx][ny] = str(cnt)
                            q.append((nx,ny))
        cnt = 1
        m = len(grid)
        n = len(grid[0])
        for i in range(m):
            for j in range(n):
                if grid[i][j] == "1":
                    cnt+=1
                    bfs(i, j, grid, m, n, cnt)

        return cnt-1
        
        
        
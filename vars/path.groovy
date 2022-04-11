String join(List<String> parts) {
    echo "$parts"
    return normalize(parts.join('/'))
}

String normalize(String path) {
    echo "$path"
    return path.replace('/', '\\')
}
int m = grid.size();
    int n = grid[0].size();
    vector<vector<int>> res(m, vector<int>(n,0));
    int total = m * n;
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            int indexToCopy = ((i*n)+j) + (k%(total);
            if(indexToCopy >= total)
                indexToCopy %= total;
            res[(indexToCopy/m)][(indexToCopy%m)] = grid[i][j];
        }
    }
    return res;

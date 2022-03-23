String join(List<String> parts) {
    echo "$parts"
    return normalize(parts.join('/'))
}

String normalize(String path) {
    echo "$path"
    return path.replace('/', '\\')
}

String join(List<String> parts) {
    return normalize(parts.join('/'))
}

String normalize(String path) {
    return path.replace('/', '\\')
}

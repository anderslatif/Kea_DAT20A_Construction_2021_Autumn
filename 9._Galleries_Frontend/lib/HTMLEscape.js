function escapeHTML(string) {
    if (!string) return "";

    return string.replace(`&`, "&amp;")
        .replace(`>`, "&gt;")
        .replace(`<`, "&lt;")
        .replace(`"`, "&quot;")
        .replace(`/`, "&#039;");
}

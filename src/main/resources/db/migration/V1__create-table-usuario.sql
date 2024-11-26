CREATE TABLE usuario (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    usuario TEXT NOT NULL,
    email TEXT NOT NULL,
    senha TEXT NOT NULL
);
export default interface Board {
    boardNumber: number;
    title: string;
    content: string;
    boardImagelist: string[];
    writeDatetime: string;
    writerEmail: string;
    writerNickname: string;
    writerProfileImage: string | null;
}


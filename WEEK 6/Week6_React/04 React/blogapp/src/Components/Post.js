import React from 'react';

class Post extends React.Component {
    render() {
        const { title, body } = this.props;
        return (
            <div style={{ margin: '20px 0', padding: '10px', border: '1px solid #ccc' }}>
                <h2>{title}</h2>
                <p>{body}</p>
            </div>
        );
    }
}

export default Post;
